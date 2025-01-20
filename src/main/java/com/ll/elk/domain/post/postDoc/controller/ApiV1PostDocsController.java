package com.ll.elk.domain.post.postDoc.controller;

import com.ll.elk.domain.post.postDoc.document.PostDocs;
import com.ll.elk.domain.post.postDoc.service.PostDocsService;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/postDocs")
@RestController
@RequiredArgsConstructor
@Validated
public class ApiV1PostDocsController {
    private final PostDocsService postDocsService;
    @PostMapping("/write")
    public PostDocs write(
            @NotBlank @RequestParam("title") String title,
            @NotBlank @RequestParam("content") String content
    ) {
        return postDocsService.write(title, content);
    }
}
