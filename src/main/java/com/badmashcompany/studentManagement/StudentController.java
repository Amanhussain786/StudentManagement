package com.badmashcompany.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer,Student> db = new HashMap<>(); //databse for storing data of students

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admNo) //access value from hashmap
    {
        return db.get(admNo);
    }

    @PostMapping("/add_new")
    String addStudent(@RequestBody() Student student)
    {
        db.put(student.getAdmNo(),student);
        return "Student Added Successfully";
    }

    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admNo)
    {
        db.remove(admNo);
        return "Student Removed Successfully";
    }

    @GetMapping("/get_name/{id}")
   String getName(@PathVariable("id") int admNo)
   {
       if(db.containsKey(admNo))
       {
           return db.get(admNo).getName();
       }
           return "Student Does not Exist";
   }

   @PutMapping("/update_name/{id}")
   String updateStudent(@PathVariable("id") int admNo)
   {
       if(db.containsKey(admNo))
       {
           db.put(admNo,db.get(admNo).setName("Aman"));
           return "Student Name Updated";
       }
       return "Student Not Exist";
   }
}

// 1 -  // Check your RequestMapping annotations: Ensure that the parameters specified in your RequestMapping annotations match the parameters being sent in the request.
    //    Also, check that the HTTP method specified in the annotation is correct.

//2 - //Check your JSON data: If you are sending JSON data in the request body, make sure that the JSON is properly formatted and contains all the required fields.
        //  You can use a tool like Postman to send the request and verify the JSON data.

//3 -// Check your request headers: Ensure that any required headers, such as the Content-Type header, are present in the request.
         // The Content-Type header should specify the type of data being sent in the request body, such as application/json or application/x-www-form-urlencoded.
//4-//Enable logging:
// Enable logging in your Spring application to see the exact request being sent and any error messages that may be returned. You can use the log4j or slf4j libraries to enable logging.

//5-//Check for validation errors: If you are using validation annotations in your Spring application, ensure that the validation constraints are being properly applied to the request parameters.
// You can use the @Valid annotation to trigger validation.