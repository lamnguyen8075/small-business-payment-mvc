package payroll;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import payroll.EmployeeController;
import payroll.OrderController;

@RestController
class RootController {

    @GetMapping
    RepresentationModel<?> index() {

        RepresentationModel<?> rootModel = new RepresentationModel<>();
        rootModel.add(linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
        rootModel.add(linkTo(methodOn(OrderController.class).all()).withRel("orders"));
        return rootModel;
    }

}