
package com.samana9SSTG.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @GetMapping("info")
    public Alumno getAlumno(){
        
        Alumno alumno = new Alumno("Stiven","Manuelo Gutierrez","programacion");
               return alumno;
    }
    
}
