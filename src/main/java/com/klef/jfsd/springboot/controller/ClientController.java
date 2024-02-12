package com.klef.jfsd.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.FacultyMentorService;
import com.klef.jfsd.springboot.service.StudentService;
import com.klef.jfsd.springboot.service.TrainerService;

@Controller
public class ClientController 
{
  @Autowired
   private AdminService adminService;
   
  @Autowired
   private StudentService studentService;
  
  @Autowired
  private TrainerService trainerService;
  
  @Autowired
  private FacultyMentorService facultyMentorService;
  
  
  @GetMapping("/")
  public String mainhomedemo()
  {
    return "index";
  }
  
  @GetMapping("/adminlogin")
  public ModelAndView adminlogindemo()
  {
    ModelAndView mv = new  ModelAndView("adminlogin");
    return mv;
  }
  
  @GetMapping("/studentlogin")
  public ModelAndView studentlogindemo()
  {
    ModelAndView mv = new  ModelAndView("studentlogin");
    return mv;
  }
  @GetMapping("/trainerlogin")
  public ModelAndView trainerlogindemo()
  {
    ModelAndView mv = new  ModelAndView("trainerlogin");
    return mv;
  }
  @GetMapping("/facultymentorlogin")
  public ModelAndView mentorlogindemo()
  {
    ModelAndView mv = new  ModelAndView("facultymentorlogin");
    return mv;
  }
  
  @GetMapping("/adminhome")
  public ModelAndView adminhomedemo()
  {
    ModelAndView mv = new  ModelAndView("adminhome");
    return mv;
  }
  
  @GetMapping("/studenthome")
  public ModelAndView studenthomedemo(HttpServletRequest request)
  {
    ModelAndView mv = new  ModelAndView("studenthome");
        HttpSession session = request.getSession();
      
      String suname = (String)session.getAttribute("suname");
    mv.addObject("suname",suname);
    return mv;
  }
  
  @GetMapping("/viewallstudents")
  public ModelAndView viewallstudentsdemo()
  {
    ModelAndView mv = new  ModelAndView("viewallstudents");
    List<Student> stulist =  adminService.viewallstudents();
    mv.addObject("stulist",stulist);
    return mv;
  }
  
  @PostMapping("/checkadminlogin")
  public ModelAndView checkadminlogindemo(HttpServletRequest request)
  {
    ModelAndView mv = new ModelAndView();
    
    String auname = request.getParameter("auname");
    String apwd = request.getParameter("apwd");
    Admin admin = adminService.checkadminlogin(auname, apwd);
    if(admin!=null)
    {
      HttpSession session = request.getSession();
      session.setAttribute("auname", auname);
      mv.setViewName("adminhome");
    }
    else
    {
      mv.setViewName("adminlogin");
      mv.addObject("msg","Login Fail");
    }
    return mv;
  }
   
  
  @PostMapping("/checkstudentlogin")
  public ModelAndView checkstudentlogindemo(HttpServletRequest request)
  {
    ModelAndView mv = new ModelAndView();
    
    String suname = request.getParameter("suname");
    String spwd = request.getParameter("spwd");
    Student s = studentService.checkstudentlogin(suname, spwd);
    if(s!=null)
    {
      HttpSession session = request.getSession();
      session.setAttribute("suname", suname);
      mv.setViewName("studenthome");
    }
    else
    {
      mv.setViewName("studentlogin");
      mv.addObject("msg","Login Fail");
    }
    return mv;
  }
  
  
  
  
  @GetMapping("/studentreg")
  public ModelAndView studentregdemo()
  {
    ModelAndView mv = new ModelAndView("studentreg", "stu", new Student());
    return mv;
  }
  @GetMapping("/trainerreg")
  public ModelAndView trainerregdemo()
  {
    ModelAndView mv = new ModelAndView("trainerreg", "tr", new Trainer());
    return mv;
  }
  @GetMapping("/facultymentorreg")
  public ModelAndView mentorregdemo()
  {
    ModelAndView mv = new ModelAndView("facultymentorreg", "mr", new FacultyMentor());
    return mv;
  }
  
  @PostMapping("/addstudent")
  public String addstudentdemo(@ModelAttribute("stu") Student student)
  
  {
    studentService.addstudent(student);

    return "redirect:adminhome";
    
}
  @PostMapping("/addtrainer")
  public String addtrainerdemo(@ModelAttribute("tr") Trainer trainer)
  
  {
    trainerService.addtrainer(trainer);

    return "redirect:adminhome";
    
}
  @PostMapping("/addfacultymentor")
  public String addfacultymentordemo(@ModelAttribute("mr") FacultyMentor facultyMentor)
  
  {
    facultyMentorService.addfacultymentor(facultyMentor);

    return "redirect:adminhome";
    
}
  
  
  
  
  
  
  
  
  
  
  @GetMapping("/deletestudent")
  public String deletestudentdemo(@RequestParam("id") int sid)
  {
    adminService.deletestudent(sid);
    
    return "redirect:viewallstudents";
  }
  
  
 
  
  
  @GetMapping("/viewstudent")
  public ModelAndView viewstudent(HttpServletRequest request)
  {
HttpSession session = request.getSession();
      
      String suname = (String)session.getAttribute("suname");
      Student stu = studentService.viewstudent(suname);
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("viewstudent");
      mv.addObject("stu", stu);
      return mv;
  }
  
  
  
  
  
  
  
  
  @GetMapping("/schangepwd")
  public ModelAndView schangepwd(HttpServletRequest request)
  {
       HttpSession session = request.getSession();
      
      String suname = (String)session.getAttribute("suname");
      ModelAndView mv = new ModelAndView();
         mv.setViewName("stuchangepwd");
         mv.addObject("suname",suname);
         return mv;
  }
  
  
  
  
  @PostMapping("/updatestudentpwd")
  public ModelAndView updatestudentpwddemo(HttpServletRequest request)
  {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("stuchangepwd");
     HttpSession session = request.getSession();
        
     String suname = (String)session.getAttribute("suname");
     
     String soldpwd = request.getParameter("sopwd");
     String snewpwd = request.getParameter("snpwd");
    System.out.println(suname+","+soldpwd+","+snewpwd);
     
     int n = studentService.changestudentpassword(soldpwd, snewpwd, suname);
     
     if(n>0)
     {
      mv.addObject("msg","Password Updated Successfully");
     }
     else
     {
       mv.addObject("msg","Old Password is Incorrect");
     }
     return mv;
  }
  
  
  
  
  
  
  
  @GetMapping("/viewstudentbyid")
  public ModelAndView viewstubyiddemo(@RequestParam("id") int sid)
  {
    Student stu = adminService.viewstudentbyid(sid);
    ModelAndView mv = new ModelAndView();
    mv.setViewName("viewstubyid");
    mv.addObject("stu", stu);
    return mv;
  }
    
  
}
  