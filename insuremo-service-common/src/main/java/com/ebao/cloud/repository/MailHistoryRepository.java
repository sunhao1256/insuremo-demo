package com.ebao.cloud.repository;

import com.ebao.cloud.domain.TMailHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailHistoryRepository extends JpaRepository<TMailHistoryEntity, Long> {


}
