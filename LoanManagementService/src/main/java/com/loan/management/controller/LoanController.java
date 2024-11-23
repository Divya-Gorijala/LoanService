package com.loan.management.controller;

        import com.loan.management.entity.Loan;
        import com.loan.management.service.LoanService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @PostMapping
    public Loan applyForLoan(@RequestBody Loan loan) {
        return loanService.applyForLoan(loan);
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }
}
