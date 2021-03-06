package com.cubewars.characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.cubewars.Coordinates;

public class CubeBoomer extends Cube
{
	private static final Texture texture = new Texture (Gdx.files.internal ("media/characters/cube-boomer.png"));
	private static final float maxHealth = 100;
	private static final float damage = 90;
	private static final int damageDistance = 2;
	private static final int travel = 2;

	public CubeBoomer (Coordinates c)
	{
		super (texture, c, maxHealth, maxHealth, damage, travel, damageDistance);
	}
}
