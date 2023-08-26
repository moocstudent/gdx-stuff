package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author zhangqi
 * @date 2023/8/13
 * @time 13:22
 * @description
 */
public class Drop2 extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    @Override
    public void create() {
        batch=new SpriteBatch();
        font=new BitmapFont();
        this.setScreen(new MainMenuScreen(this));

    }
    public void render() {
        super.render(); // important!
    }

    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
