package virtual.pet.shelter;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {
    HashMap<String, VirtualPet> PetShelter;

    public VirtualPetShelter(){

        PetShelter= new HashMap<String, VirtualPet>();

    }
    public Collection<VirtualPet> getAllPets(){
        return PetShelter.values();
    }
    public void AddPet(VirtualPet pet){
    PetShelter.put(pet.getName(), pet);
    }
    public void AdoptPet(String Name){
        PetShelter.remove(Name);
    }
    public void FeedAllPets(){
        for(VirtualPet pet: getAllPets()){
            pet.feed();
        }
    }
    public void WaterAllPets(){
        for(VirtualPet pet: getAllPets()){
            pet.drink();
        }
    }
    public void PlayWithPets(){
        for(VirtualPet pet: getAllPets()){
            pet.play();
        }
    }
    public void TickAllPets(){
        for(VirtualPet pet: getAllPets()){
            pet.tick();
        }
    }
    public void DisplayStats(){
        System.out.println("Curent Pet Status: ");
        for(VirtualPet pet: getAllPets()){
            System.out.println("Name: " + pet.getName());
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Boredom: " + pet.getBoredom());
        }
    }

}
