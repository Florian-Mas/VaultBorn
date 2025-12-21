package com.vaultborn.world;

import com.vaultborn.MainGame;
import com.vaultborn.entities.characters.mobs.Minotaur;
import com.vaultborn.entities.characters.mobs.Mob;
import com.vaultborn.entities.characters.mobs.Tengu;
import com.vaultborn.entities.characters.mobs.Yokai;
import com.vaultborn.entities.stuff.GameObject;
import com.vaultborn.entities.stuff.trigger.SpecialDoor;
import com.vaultborn.factories.FactoryException;

public class DungeonWorld extends BaseWorld{
    public DungeonWorld(MainGame  game) throws FactoryException {
        super(game,"DungeonMap/map", "backgrounds/background_dungeon.jpg");
        this.game = game;
        levelName = "dungeon";
        setBoss(Yokai.class);
        this.spawnX = 350;
        this.spawnY = 200;
    }
    
    @Override
    protected void initMobs() throws FactoryException {
        
        Mob boss = factory.createMob("Yokai", 2390, 3394, this, 70);
        boss.setBoss();
        mobs.add(boss);

        mobs.add(factory.createMob("gorgon", 1209,130, this, 8));
        mobs.add(factory.createMob("gorgon", 1484,130, this, 8));
        mobs.add(factory.createMob("minotaur", 1727,130, this, 8));
        mobs.add(factory.createMob("gorgon", 1976,226, this, 10));
        mobs.add(factory.createMob("minotaur", 2231,226, this, 10));
        mobs.add(factory.createMob("minotaur", 2723,322, this, 10));
        mobs.add(factory.createMob("gorgon",2887,322,this,11));
        mobs.add(factory.createMob("gorgon",3150,322,this,11));
        mobs.add(factory.createMob("minotaur",3333,322,this,12));
        mobs.add(factory.createMob("minotaur",3497,322,this,12));
        mobs.add(factory.createMob("gorgon", 3890,466, this, 25)); //boosted
        mobs.add(factory.createMob("gorgon", 5228,898, this, 15)); //SUR PLATEFORME
        mobs.add(factory.createMob("minotaur",4880,946,this,17));
        mobs.add(factory.createMob("gorgon",4710,946,this,17));
        mobs.add(factory.createMob("minotaur",4651,946,this,17));
        mobs.add(factory.createMob("minotaur",4592,946,this,17));
        mobs.add(factory.createMob("gorgon",4481,946,this,17));
        mobs.add(factory.createMob("gorgon",4395,946,this,17));
        mobs.add(factory.createMob("minotaur",4317,946,this,17));
        mobs.add(factory.createMob("gorgon",4186,946,this,17));
        mobs.add(factory.createMob("gorgon",3956,946,this,17));
        mobs.add(factory.createMob("gorgon",3792,946,this,17));
        mobs.add(factory.createMob("minotaur",3641,946,this,17));
        mobs.add(factory.createMob("minotaur",3523,946,this,17));
        mobs.add(factory.createMob("gorgon", 2920,946, this, 30)); //boosted
        mobs.add(factory.createMob("gorgon",2428,946, this, 40)); //boosted
        mobs.add(factory.createMob("gorgon",2061,946, this, 50)); //boosted
        
        mobs.add(factory.createMob("gorgon",2264,1522,this,20));
        mobs.add(factory.createMob("minotaur",2300,1522,this,20));
        mobs.add(factory.createMob("gorgon",2400,1522,this,20));
        mobs.add(factory.createMob("minotaur",2500,1522,this,20));
        mobs.add(factory.createMob("minotaur",2600,1522,this,20));
        mobs.add(factory.createMob("gorgon",2700,1522,this,20));
        mobs.add(factory.createMob("gorgon",2800,1522,this,20));
        mobs.add(factory.createMob("gorgon",2900,1522,this,20));
        mobs.add(factory.createMob("gorgon",3000,1522,this,20));
        mobs.add(factory.createMob("minotaur",4000,1522,this,1000));//boosted
        mobs.add(factory.createMob("gorgon",5000,1522,this,25));
        mobs.add(factory.createMob("gorgon",5100,1522,this,25));
        mobs.add(factory.createMob("gorgon",5200,1522,this,25));
        mobs.add(factory.createMob("minotaur",5300,1522,this,25));
        mobs.add(factory.createMob("minotaur",5438,1522,this,25));
        
        mobs.add(factory.createMob("gorgon",5058,2002,this,30));
        mobs.add(factory.createMob("minotaur",4750,2002,this,30));
        mobs.add(factory.createMob("gorgon",4409,2002,this,30));
        mobs.add(factory.createMob("minotaur",3064,2530, this, 50)); //boosted
        mobs.add(factory.createMob("gorgon",4658,2866, this, 50)); //boosted
        mobs.add(factory.createMob("gorgon",5130,2866, this, 50)); //boosted
        //début en ajouter plus
        mobs.add(factory.createMob("gorgon",2600, 3394, this,45 ));
        mobs.add(factory.createMob("gorgon",2700,3394,this,45));
        mobs.add(factory.createMob("minotaur",2800,3394,this,45));
        mobs.add(factory.createMob("minotaur",2900,3394,this,35));
        mobs.add(factory.createMob("gorgon",3000,3394,this,35));
        mobs.add(factory.createMob("minotaur",4000,3394,this,55));//boosted
        mobs.add(factory.createMob("gorgon",5000,3394,this,30));
        mobs.add(factory.createMob("gorgon",5136,3394, this, 30));
        //din de en ajouter plus
    }

    @Override
    protected void initObjects() throws FactoryException{

        gameObjects.add(factory.createObject("ironfoot", 5180,369, null,20));
        gameObjects.add(factory.createObject("helmet", 3340,621, null,30));
        gameObjects.add(factory.createObject("gauteletplate", 3530,945, null,30));
        gameObjects.add(factory.createObject("breastplate", 1960,1434, null,30));
        gameObjects.add(factory.createObject("sword", 2671,2625, null,40));
        gameObjects.add(factory.createObject("legplate", 5405,3245, null,30));
        

        //porte suivante
        SpecialDoor door = (SpecialDoor) factory.createSpecialDoor("special_door", 1856, 3394, this, game.hellWorld);
        door.setParentWorld(this);
        door.setSpawnPosition(550, 3800); // Position d'arrivée dans HellWorld
        gameObjects.add(door);
    }

    public void linkWorlds() {
        for (GameObject obj : gameObjects) {
            if (obj instanceof SpecialDoor) {
                SpecialDoor door = (SpecialDoor) obj;
                door.setTargetWorld(game.hellWorld);
            }
        }
    }
}
