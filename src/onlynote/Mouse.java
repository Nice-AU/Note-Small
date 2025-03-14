/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlynote;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author ALAN
 */

public class Mouse implements MouseListener,MouseMotionListener{ 


    private final Frame theFrame;


public Mouse(Frame theFrame){
this.theFrame = theFrame;

}

private Point startClick;

public void mouseDragged(MouseEvent e) {
    int deltaX = e.getX()-startClick.x;
    int deltaY = e.getY()-startClick.y;
        int x = 0;
        int y = 0;
       e.getComponent().setLocation(e.getX() + e.getComponent().getX() - x, e.getY() + e.getComponent().getY() - y);

 //   Core.getSp().setLocation(theFrame.getLocation().x+deltaX, theFrame.getLocation().y+deltaY);
}

public void mousePressed(MouseEvent e) {
    startClick = e.getPoint();

}

public void mouseMoved(MouseEvent e){

}
@Override
public void mouseClicked(MouseEvent e) {


}
@Override
public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

}
@Override
public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

}
@Override
public void mouseReleased(MouseEvent e) {

}
    
}
