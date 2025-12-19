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
        
        Mob boss = factory.createMob("Yokai", 2390, 3394, this, 1);
        boss.setBoss();
        mobs.add(boss);

        //mobs.add(factory.createMob("gorgon", 1200, 400, this, 1));
        //mobs.add(factory.createMob("gorgon", 880, 400, this, 1));
    }

    @Override
    protected void initObjects() {

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
