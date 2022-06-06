package com.example.its.web.issue;

import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/issues")
public class issueController {

  private final IssueService issueService;

  @GetMapping
  public String showList(Model model) {

    model.addAttribute("issueList", issueService.findAll());
    return "issues/list";
  }

  @GetMapping("/creationForm")
  public String showCreationForm() {
    return "issues/creationForm";
  }

  @PostMapping
  public String create(IssueForm form, Model model) {

    return showList(model);
  }
}
