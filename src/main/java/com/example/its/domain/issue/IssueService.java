package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

  private final IssueRepository issueRepository;

  public List<IssueEntity> findAll() {
    var issueList = issueRepository.findAll();

    return issueList;
  }
}
