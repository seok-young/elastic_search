package com.ll.elk.domain.post.postDoc.service;

import com.ll.elk.domain.post.postDoc.document.PostDocs;
import com.ll.elk.domain.post.postDoc.repository.PostDocsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostDocsService {
    private final PostDocsRepository postDocsRepository;
    public PostDocs write(@NotBlank String title, @NotBlank String content) {
        PostDocs postDocs = PostDocs.builder()
                .title(title)
                .content(content)
                .build();
        return postDocsRepository.save(postDocs);
    }

    public void truncate() {
        postDocsRepository.deleteAll();
    }
}
