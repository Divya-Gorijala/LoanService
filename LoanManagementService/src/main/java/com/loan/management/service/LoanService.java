package com.loan.management.service;

        import com.loan.management.entity.Loan;
        import com.loan.management.repo.LoanRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan applyForLoan(Loan loan) {
        loan.setStatus("Pending");
        return loanRepository.save(loan);
    }

    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElse(null);
    }
}
