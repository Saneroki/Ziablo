/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.collision;


import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Sadik
 */
@ServiceProvider(service = IGamePluginService.class)
public class CollisionPlugin implements IGamePluginService {

    private Entity entity;

    @Override
    public void start(GameData gameData, World world) {
        
    }
    
//    private Entity createCollision(GameData gameData){
//        Entity collision = new Player();
//        collision.add(new MovingPart(deacceleration, acceleration, maxSpeed, rotationSpeed));
//        collision.add(new PositionPart(x, y, radians));
//        
//        return collision;
//    }

    @Override
    public void stop(GameData gameData, World world) {
    }

}
