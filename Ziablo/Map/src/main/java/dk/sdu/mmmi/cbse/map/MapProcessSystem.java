/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.map;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.LEFT;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.RIGHT;
import static dk.sdu.mmmi.cbse.common.data.GameKeys.UP;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.data.entityparts.MovingPart;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import static java.lang.Math.random;
import java.util.Random;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author Sadik
 */
@ServiceProvider(service = IEntityProcessingService.class)

public class MapProcessSystem implements IEntityProcessingService {

    @Override
    public void process(GameData gameData, World world) {

    }

    private void updateShape(Entity entity) {
//        float[] shapex = entity.getShapeX();
//        float[] shapey = entity.getShapeY();
//        PositionPart positionPart = entity.getPart(PositionPart.class);
//        float x = positionPart.getX();
//        float y = positionPart.getY();
//        float radians = positionPart.getRadians();
//
//        shapex[0] = (float) (x + Math.cos(radians) * 8);
//        shapey[0] = (float) (y + Math.sin(radians) * 8);
//
//        shapex[1] = (float) (x + Math.cos(radians - 4 * 3.1415f / 5) * 8);
//        shapey[1] = (float) (y + Math.sin(radians - 4 * 3.1145f / 5) * 8);
//
//        shapex[2] = (float) (x + Math.cos(radians + 3.1415f) * 5);
//        shapey[2] = (float) (y + Math.sin(radians + 3.1415f) * 5);
//
//        shapex[3] = (float) (x + Math.cos(radians + 4 * 3.1415f / 5) * 8);
//        shapey[3] = (float) (y + Math.sin(radians + 4 * 3.1415f / 5) * 8);
//
//        entity.setShapeX(shapex);
//        entity.setShapeY(shapey);
    }

}