package service;

import model.Resume;

import java.util.List;

public interface ResumeService {


    Resume save(Resume resume);

    Resume findById(Long id);

    List<Resume> findAllResumes(String username);
}
