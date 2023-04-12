package controller;

import lombok.AllArgsConstructor;
import model.Resume;
import org.springframework.web.bind.annotation.*;
import service.ResumeService;

import java.util.List;


@AllArgsConstructor
@RestController
public class ResumeController
{

     private final ResumeService resumeService;
    @GetMapping("id")
    public Resume findById(@RequestParam("id") Long id){
        return  resumeService.findById(id);
    }
    @GetMapping("/usernames")
    public List<Resume> findAllByUsername(@RequestParam("username") String username){
        return  resumeService.findAllResumes(username);
    }
    @PostMapping("/resume")
    public Resume saveResume(@RequestBody Resume  resume){
        return  resumeService.save(resume);
    }

}
