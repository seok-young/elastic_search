package com.ll.elk.domain.post.postDoc.controller;

import com.ll.elk.domain.post.postDoc.document.PostDocs;
import com.ll.elk.domain.post.postDoc.service.PostDocsService;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/post")
@RestController
@RequiredArgsConstructor
@Validated
public class ApiV1PostDocsController {
    private final PostDocsService postDocsService;
    @GetMapping("/write")
    public PostDocs write(
            @NotBlank String title,
            @NotBlank String content
    ) {
        return postDocsService.write(title, content);
    }
}
