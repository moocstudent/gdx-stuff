package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * @author zhangqi
 * @date 2023/8/28
 * @time 20:26
 * @description
 */
public class Person extends ApplicationAdapter {
    public SpriteBatch batch;
    public static final int FRAME_COLS = 6;
    public static final int FRAME_ROWS = 5;

    private Animation<TextureRegion> walkAnimation;

    private Texture walkSheet;

    private TextureRegion[] walkFrames;

    private TextureRegion currentFrame;

    private float stateTime;

    @Override
    public void create() {
        batch = new SpriteBatch();

        walkSheet = new Texture(Gdx.files.internal("person.png"));
        TextureRegion[][] tmp = TextureRegion.split(walkSheet,
                walkSheet.getWidth()/FRAME_COLS,
                walkSheet.getHeight()/FRAME_ROWS);

        walkFrames = new TextureRegion[FRAME_ROWS* FRAME_COLS];

        int index = 0;

        for(int i=0;i<FRAME_ROWS;i++){
            for(int j=0;j<FRAME_COLS;j++){
                walkFrames[index++]=tmp[i][j];
            }
        }

        walkAnimation = new Animation<TextureRegion>(0.025f,walkFrames);
        walkAnimation.setPlayMode(Animation.PlayMode.LOOP);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stateTime += Gdx.graphics.getDeltaTime();

        currentFrame= (TextureRegion) walkAnimation.getKeyFrame(stateTime,true);
        batch.begin();
        batch.draw(currentFrame,200,100);
        batch.end();
    }
}
