package sk.matusko.tutorial.openapicustomvalidations.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import sk.matusko.tutorial.openapicustomvalidations.api.PetsApi;
import sk.matusko.tutorial.openapicustomvalidations.model.Pet;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PetsController implements PetsApi {

    @Override
    public ResponseEntity<List<Pet>> listPets(Integer limit) {

        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet().id(1L).name("Bobo"));
        return new ResponseEntity<>(petList, HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> createPets() {
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}
