package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

class Test {

public static void main(String[] args){

Veena vn = new Veena();

vn.play();

Saxophone sx = new Saxophone();

sx.play();

Playable pl;

pl = vn;

pl.play();

pl = sx;

pl.play();

}

}