package com.ll.elk.domain.post.postDoc.repository;

import com.ll.elk.domain.post.postDoc.document.PostDocs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostDocsRepository extends ElasticsearchRepository<PostDocs, String> {
}
