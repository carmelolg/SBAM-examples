package it.carmelolagamba.sbam.adapters.resource.assembler;

import it.carmelolagamba.sbam.adapters.resource.UserResource;
import it.carmelolagamba.sbam.core.domain.model.UserOutputModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class UserResourceAssembler implements IAssembler<UserResource, UserOutputModel> {

    private final ModelMapper modelMapper;

    @Override
    public UserResource fromModel(UserOutputModel userOutputModel) {
        log.debug("Converting UserOutputModel to UserResource: {}", userOutputModel);
        return modelMapper.map(userOutputModel, UserResource.class);
    }
}
