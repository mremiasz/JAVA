package pl.edu.uj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.uj.entities.Person;
import pl.edu.uj.entities.Role;
import pl.edu.uj.repositories.RoleRepository;
import pl.edu.uj.repositories.PersonRepository;

@RestController
public class Controller {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/role/add")
    public String addRole(@RequestParam(name = "name") String name) {
        Role r = roleRepository.save(new Role(name));
        return r.toString();
    }
    @RequestMapping("/roles/list")
    public String listRoles() {
        StringBuilder result = new StringBuilder();
        for (Role r : roleRepository.findAll()) {
            result.append(r.toString()).append(System.lineSeparator());
            result.append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("/person/add")
    public String addPerson(@RequestParam(name ="name")String name,@RequestParam(name ="roleName") String roleName){
        Role r = roleRepository.findByName(roleName).get(0);
        Person p = personRepository.save(new Person(name,r));
        return "Dodano osobę: " + p.toString();
    }

    @RequestMapping("/person/remove")
    public void removePerson(@RequestParam(name = "id") Integer id){
        for (Person p : personRepository.findById(id)){
            personRepository.delete(p);
        }
    }

    @RequestMapping("/person/list")
    public String listPersons() {
        StringBuilder result = new StringBuilder();
        for (Person p : personRepository.findAll()){
            result.append(p.toString());
            result.append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("person/names")
    public String listNames() {
        StringBuilder result = new StringBuilder();
        for (String p : personRepository.findAllNames()){
            result.append(p);
            result.append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("person/roles")
    public String listNamesByRoles(@RequestParam(name = "roleName") String roleName) {

        StringBuilder result = new StringBuilder();
        for (String p : personRepository.findNameByRole(roleName)){
            result.append(p);
            result.append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("person/letter")
    public String listNamesByLetter(@RequestParam(name = "letter") String letter) {

        StringBuilder result = new StringBuilder();
        for (String p : personRepository.findNameByLetter(letter)){
            result.append(p);
            result.append("<br>");
        }
        return result.toString();
    }
}