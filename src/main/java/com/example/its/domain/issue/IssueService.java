package com.example.its.domain.issue;

import java.util.List;

public class IssueService {
  public List<IssueEntity> findAll() {
    var issueList =
        List.of(
            new IssueEntity(1, "概要1", "説明１"),
            new IssueEntity(2, "概要2", "説明2"),
            new IssueEntity(3, "概要3", "説明3"));

    return issueList;
  }
}
