package service.impl;

import model.Resume;
import repositiry.ResumeRepository;
import service.ResumeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ResumeServiceImpl implements ResumeService {
    private final ResumeRepository resumeRepository;

    @Override
    public Resume save(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public Resume findById(Long id) {
        return resumeRepository.findById(id).get();
    }


    public List<Resume> findAllResumes(String username) {
        return resumeRepository.findAllByUsername(username);
    }
}
