package org.fasttrackit;


public class App
{
        public static  void main(String[] args )
            // this is the one-line comment

            {
                Pet pet = new Pet();
                pet.name = "Carlitos";
                pet.age=25;
                pet.healtCondition=10;
                pet.favoriteFood="Purina";
                pet.favoriteActivity="walk";
                pet.hungryLevel=10;
                pet.mood=1;

// Pet pet2= new Pet();
// pet.name="Dixon";
// pet.age=6;
// pet.healtCondition=8;
// pet.favoriteFood=" any meat";
// pet.favoriteActivity="walk";
// pet.hungryLevel=1;
// pet.mood=3;

                Rescuer rescuer=new Rescuer();
                rescuer.name="Andrei";
                rescuer.walletLevel=5000;

                Veterinarian veterinary=new Veterinarian();
                veterinary.name="Vlad";


                pet.rescuer=rescuer;
                pet.veterinary=veterinary;
//pet2=pet; //suprascriere;
               System.out.println(pet.name);
               System.out.println(pet.hungryLevel);
               // System.out.println(pet.rescuer);
               // System.out.println(pet.veterinary);
                pet.getHungryLevel(pet.hungryLevel);
                pet.getFavoriteActivity(pet.mood);
            }
        }