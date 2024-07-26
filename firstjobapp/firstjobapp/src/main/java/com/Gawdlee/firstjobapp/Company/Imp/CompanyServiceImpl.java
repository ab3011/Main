package com.Gawdlee.firstjobapp.Company.Imp;

import com.Gawdlee.firstjobapp.Company.Company;
import com.Gawdlee.firstjobapp.Company.CompanyRepository;
import com.Gawdlee.firstjobapp.Company.CompanyService;
import com.Gawdlee.firstjobapp.job.Job;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(companyOptional.isPresent()) {
            Company companyToUpdate = companyOptional.get();
            companyToUpdate.setName(company.getName());
            companyToUpdate.setDescription(company.getDescription());
            companyRepository.save(companyToUpdate);
            return true;
        }
        return false;
    }

    @Override
    public void createCompany(Company company) {
        System.out.println("Creating company: " + company.getName() + ", " + company.getDescription());
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompany(Long id) {
        if(companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
      return companyRepository.findById(id).orElse(null);
    }

}
