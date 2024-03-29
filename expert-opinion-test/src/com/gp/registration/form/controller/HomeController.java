package com.gp.registration.form.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gp.registration.form.entity.Doctor;
import com.gp.registration.form.entity.Login;
import com.gp.registration.form.entity.Patient;
import com.gp.registration.form.entity.RadiologyCenter;
import com.gp.registration.form.service.DoctorService;
import com.gp.registration.form.service.PatientService;
import com.gp.registration.form.service.RadiologyCenterService;

// *********Read me**********
//The structure of the controller
// 1- Mapping of home page
// 2- Mapping of CRUD of the patient
// 3- Mapping of CRUD of the Doctor
// 4- Mapping of CRUD of the RadiologyCenter
// 5- Mapping of login
//***************************

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	//--------------------------- ( 1 ) ---------------------------
	@GetMapping("/welcome")
	public String welcome() {
		
		return "home";
	}
	
	//--------------------------- PATIENT ---------------------------
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patientLogin")
	public String patientLogin(Model theModel)
	{
		// create model attribute to bind form data
		Login thelog = new Login();
		
		theModel.addAttribute("log", thelog);
		
		return "fancy-login";
	}
	
	@PostMapping("/processPatientLogin")
	public String listPatients(@Valid @ModelAttribute("log") Login thePatient
			,BindingResult theBindingResult)
	{
		
		if (theBindingResult.hasErrors()) {
			
			return "redirect:/home/welcome";
		} 
		else {
			
			List<Patient> thePatients = patientService.getPatients(); 
			
			for(int i=0;i<thePatients.size();i++) {
				if(thePatients.get(i).getMail() == thePatient.getMail()
						&& thePatients.get(i).getPassword() == thePatient.getPassword()) {
					
						return "welcome-patient";
				}
			}
		}
		return "Error";
	}
	
	
	@GetMapping("/patientFormForAdd")
	public String patientFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Patient thePatient = new Patient();
		
		theModel.addAttribute("patient", thePatient);
		
		return "patient-form";
	}
	
	@PostMapping("/savePatient")
	public String savePatient(@Valid @ModelAttribute("patient") Patient thePatient
			,BindingResult theBindingResult)
	{
		
		if (theBindingResult.hasErrors()) {
			return "patient-form";
		}
		else {
			patientService.savePatient(thePatient);
			return "redirect:/home/welcome";
		}
	}
	
	@GetMapping("/patientFormForUpdate")
	public String patientFormForUpdate(@RequestParam("patientId") int theId,Model theModel)
	{
		Patient thePatient = patientService.getPatient(theId);

		theModel.addAttribute("patient", thePatient);
		// send over to our form		
		return "patient-form";
	}
	
	@GetMapping("/patientdelete")
	public String patientdelete(@RequestParam("patientId")int theId)
	{
		patientService.deletePatient(theId);
		return "redirect:/home/patientList";
	}

	
	//--------------------------- DOCTOR ---------------------------
	@Autowired
	private DoctorService doctorService;
	
	public DoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	@RequestMapping("/doctorList")
	public String getDoctors(Model theModel)
	{
		List<Doctor> theDoctors = doctorService.getDoctors();
		
		theModel.addAttribute("doctors", theDoctors);
		
		return "list-doctors";
	}

	@GetMapping("/doctorFormForAdd")
	public String doctorFormForAdd(Model theModel)
	{
	   // create model attribute to bind form data
		Doctor theDoctor = new Doctor();
		
		theModel.addAttribute("doctor", theDoctor);
		
		return "doctor-form";
	}

	@PostMapping("/saveDoctor")
	public String saveDoctor(@Valid @ModelAttribute("doctor") Doctor theDoctor
			,BindingResult theBindingResult)
	{
		if (theBindingResult.hasErrors()) {
			return "doctor-form";
		}
		else {
			doctorService.saveDoctor(theDoctor);
			return "redirect:/home/welcome";
		}
	}
	
	@GetMapping("/doctorFormForUpdate")
	public String doctorFormForUpdate(@RequestParam("doctorId") int theId , Model theModel)
	{
		Doctor theDoctor = doctorService.getDoctor(theId);
		theModel.addAttribute(theDoctor);
		
		return "doctor-form";
	}
	
	@GetMapping("/deleteDoctor")
	public String deleteDoctor(@RequestParam("doctorId") int theId)
	{
		doctorService.deleteDoctor(theId);
		return "redirect:/home/doctorList";
	}
	
	@ModelAttribute("yearList")
	public List<Integer> getYearList() {
	      List<Integer> yearList = new ArrayList<Integer>();
	      for(int i=1975;i<2018;i++) {
	    	  yearList.add(i);
	      }
	      return yearList;
	   }
	
	@ModelAttribute("speciaist")
	   public List<String> getspeciaist() {
	      List<String> speciaist = new ArrayList<String>();
	      speciaist.add("Abdominal Surgery");speciaist.add("Addiction Medicine");speciaist.add("Addiction Psychiatry");
	      speciaist.add("Adolescent Medicine");speciaist.add("Adult Orthopedic Surgery");speciaist.add("Aerospace Medicine");
	      speciaist.add("Allergy");speciaist.add("Anatomic Pathology");speciaist.add("Anatomic/Clinical Pathology");
	      speciaist.add("Anesthesiology");speciaist.add("Bariatrician");speciaist.add("Blood Banking");
	      speciaist.add("Cardiac Electrophysiology");speciaist.add("Cardiovascular Disease");speciaist.add("Cardiovascular Surgery");
	      speciaist.add("Chemical Pathology");speciaist.add("Clinical Genetics");speciaist.add("Clinical Neurophysiology");
	      speciaist.add("Clinical Pathology");speciaist.add("Clinical Pharmacology");speciaist.add("Colon and Rectal Surgery");
	      speciaist.add("Critical Care Anesthesiology");speciaist.add("Critical Care Medicine");speciaist.add("Critical Care Surgery");
	      speciaist.add("Cytopathology");speciaist.add("DentalEndodontics");speciaist.add("DentalGeneral Practice");
	      speciaist.add("DentalOral and Maxillofacial Surgery");speciaist.add("DentalOral Pathology");speciaist.add("DentalOrthodontics");
	      speciaist.add("DentalPediatrics");speciaist.add("DentalPeriodontics");speciaist.add("DentalPublic Health");
	      speciaist.add("Dermatologic Surgery");speciaist.add("Dermatology");speciaist.add("Dermatology");
	      speciaist.add("Dermatopathology");speciaist.add("DevelopmentalBehavioral Pediatrics");speciaist.add("Diabetes");
	      speciaist.add("Diagnostic Radiology");speciaist.add("Emergency Medicine");speciaist.add("Endocrinology");
	      speciaist.add("Family Practice");speciaist.add("Flexible");speciaist.add("Foot and Ankle Orthopedics");
	      speciaist.add("Forensic Pathology");speciaist.add("Forensic Psychiatry");speciaist.add("Gastroenterology");
	      speciaist.add("General Practice");speciaist.add("General Preventive Medicine");
	      return speciaist;
	   }
	
	@ModelAttribute("bestTimeToContact")
	   public List<String> getBestTimeToContact() {
	      List<String> bestTimeToContact = new ArrayList<String>();
	      bestTimeToContact.add("AM");
	      bestTimeToContact.add("PM");
	      bestTimeToContact.add("Evenings");
	      bestTimeToContact.add("Weekend");
	      return bestTimeToContact;
	   }
	
	@ModelAttribute("responseTime")
	   public List<String> getResponseTime() {
	      List<String> responseTime = new ArrayList<String>();
	      responseTime.add("6 hours");
	      responseTime.add("12 hours");
	      responseTime.add("1 day");
	      responseTime.add("2 days");
	      responseTime.add("According my time..");
	      return responseTime;
	   }

	//--------------------------- RadiologyCenter ---------------------------
	@Autowired
	private RadiologyCenterService radiologyCenterService;
	
	@RequestMapping("/radiologyCenterlist")
	public String radiologyCenterlist(Model theModel)
	{
		List<RadiologyCenter> theRadiologyCenters = radiologyCenterService.getRadiologyCenters();
		
		theModel.addAttribute("radiologyCenters", theRadiologyCenters);
		
		return "list-radiologyCenters";
	}
	
	@GetMapping("/radiologyCenterFormForAdd")
	public String radiologyCenterFormForAdd(Model theModel)
	{
		// create model attribute to bind form data
		RadiologyCenter theRadiologyCenter = new RadiologyCenter();
		
		theModel.addAttribute("radiologyCenter",theRadiologyCenter);
		
		return "radiologyCenter-form";
	}
	
	@PostMapping("/saveRadiologyCenter")
	public String savePatient(@Valid @ModelAttribute("radiologyCenter") RadiologyCenter theRadiologyCenter
			,BindingResult theBindingResult)
	{
		
		if (theBindingResult.hasErrors()) {
			return "radiologyCenter-form";
		}
		else {
			radiologyCenterService.saveradiologyCenter(theRadiologyCenter);
			return "redirect:/home/welcome";
		}
		
		
	}
	
	@GetMapping("/radiologyCenterFormForUpdate")
	public String radiologyCenterFormForUpdate(@ModelAttribute("radiologyCenterId") int theId , Model theModel)
	{
		RadiologyCenter theradiologyCenter = radiologyCenterService.getRadiologyCenter(theId);
		theModel.addAttribute("radiologyCenter",theradiologyCenter);
		return "radiologyCenter-form";
	}
	
	@GetMapping("/deleteRadiologyCenter")
	public String deleteRadiologyCenter(@RequestParam("radiologyCenterId") int theId)
	{
		radiologyCenterService.deleteRadiologyCenter(theId);
		return "redirect:/home/radiologyCenterlist";
	}	
	
	//--------------------------- ( 5 ) -----------------------------
	//--------------------------- login -----------------------------
	
	
	/*@GetMapping("/loginProcess")
	public String saveDoctor(@Valid @ModelAttribute("login") login theLogin
			,BindingResult theBindingResult)
	{	
		if (theBindingResult.hasErrors()) {
			return "redirect:/home/welcome";
		}
		else {
			List<Doctor> theDoctors = doctorService.getDoctors();
			for(int i=0;i<theDoctors.size();i++) {
				if(theDoctors.get(i).getMail() == theLogin.getMail()) {
					if(theDoctors.get(i).getPassword() == theLogin.getPassword()) {
						return "list-doctors";
					}
				}
			}
			
			List<Patient> thePatients = patientService.getPatients(); 
			for(int i=0;i<thePatients.size();i++) {
				if(thePatients.get(i).getMail() == theLogin.getMail()) {
					if(thePatients.get(i).getPassword() == theLogin.getPassword()) {
						return "list-patient";
					}
				}
			}
			
			/*List<RadiologyCenter> theRadiologyCenters = radiologyCenterService.getRadiologyCenters();
			for(int i=0;i<theRadiologyCenters.size();i++) {
				if(theRadiologyCenters.get(i).getMail() == theLogin.getMail()) {
					if(theRadiologyCenters.get(i).getPassword() == theLogin.getPassword()) {
						return "list-radiologyCenters";
					}
				}
			}
			
			
			return "redirect:/home/welcome";
		}
	}*/
	
}
