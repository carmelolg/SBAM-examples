package it.carmelolagamba.sbam.core.service;

import it.carmelolagamba.sbam.core.domain.mapper.UserMapper;
import it.carmelolagamba.sbam.core.domain.model.UserOutputModel;
import it.carmelolagamba.sbam.integration.http.UserRetriever;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {

    private final UserRetriever userRetriever;
    private final UserMapper userMapper;

    public List<UserOutputModel> fetchUsers() {
        try {
            log.info("Fetched users successfully");
            return userRetriever.get().stream()
                    .map(userMapper::toModel)
                    .toList();

        } catch (Exception e) {
            log.error("Failed to fetch users: {}", e.getMessage());
            throw new RuntimeException("Failed to fetch users", e);
        }
    }

}
