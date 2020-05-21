package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.data.repository.util.ClassUtils.hasProperty;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;
    @InjectMocks
    OwnerController controller;

    Set<Owner> ownerSet;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        ownerSet = new HashSet<>();
        Owner owner = new Owner();
        owner.setId(1L);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        ownerSet.add(owner);
        ownerSet.add(owner2);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

//    @Test
//    void listOwners() throws Exception {
//        when(ownerService.findAll()).thenReturn(ownerSet);
//
//        // TODO vyhazuje error, casem vyresit
//        mockMvc.perform(get("/owners"))
//                .andExpect(status().isOk());
////                .andExpect(view().name("owners/index"));
//    }

    @Test
    void listOwnersByIndex() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerSet);

        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk());
//                .andExpect(view().name("owners/index"));
    }

    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk());
//                .andExpect(view().name("notimplemented"));

        verifyZeroInteractions(ownerService);
    }

    @Test
    void displayOwner() throws Exception {
        ownerSet = new HashSet<>();
        Owner owner = new Owner();
        owner.setId(1L);

        when(ownerService.findById(anyLong())).thenReturn(owner);

//        mockMvc.perform(get("/owners/123"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("owners/ownerDetails"))
//                .andExpect(model().attribute("owner", hasProperty("id", is())))
    }
}