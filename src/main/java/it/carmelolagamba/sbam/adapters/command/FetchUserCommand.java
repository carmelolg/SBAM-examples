package it.carmelolagamba.sbam.adapters.command;

import it.carmelolagamba.sbam.core.domain.model.UserOutputModel;
import it.carmelolagamba.sbam.core.facade.CoreServiceFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
@Slf4j
public class FetchUserCommand implements ICommand<List<UserOutputModel>>{

    private final CoreServiceFacade coreServiceFacade;

    @Override
    public List<UserOutputModel> execute() {
        log.debug("Executing command to fetch users");
        return coreServiceFacade.getUsers();
    }
}
