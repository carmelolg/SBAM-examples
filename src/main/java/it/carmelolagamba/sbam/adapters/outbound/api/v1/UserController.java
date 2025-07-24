package it.carmelolagamba.sbam.adapters.outbound.api.v1;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.carmelolagamba.sbam.adapters.command.FetchUserCommand;
import it.carmelolagamba.sbam.adapters.resource.UserResource;
import it.carmelolagamba.sbam.adapters.resource.assembler.UserResourceAssembler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@AllArgsConstructor
@RestController
@Tag(name = "System Information", description = "System Information")
@Slf4j
public class UserController implements IRestController{

    private final UserResourceAssembler userResourceAssembler;
    private final FetchUserCommand fetchUserCommand;


    @Operation(summary = "Get environment info")
    @RequestMapping(method = RequestMethod.GET, path = "/user")
    public ResponseEntity<List<UserResource>> user() {
        log.debug("Retrieving system information");
        return ok(fetchUserCommand.execute().stream().map(userResourceAssembler::fromModel).toList());
    }
}
