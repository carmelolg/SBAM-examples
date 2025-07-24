package it.carmelolagamba.sbam.core.domain.mapper;

import it.carmelolagamba.sbam.core.domain.model.UserOutputModel;
import it.carmelolagamba.sbam.integration.http.entity.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class UserMapper implements IMapper<UserOutputModel, User> {

    private final ModelMapper modelMapper;

    @Override
    public User toEntity(UserOutputModel userOutputModel) {

        if (userOutputModel != null) {
            return modelMapper.map(userOutputModel, User.class);
        }

        log.error("UserOutputModel is null, cannot map to User entity");
        throw new IllegalArgumentException("UserOutputModel cannot be null");
    }

    @Override
    public UserOutputModel toModel(User user) {

        if (user != null) {
            return modelMapper.map(user, UserOutputModel.class);
        }
        log.error("User is null, cannot map to UserOutputModel");
        throw new IllegalArgumentException("User cannot be null");
    }
}
