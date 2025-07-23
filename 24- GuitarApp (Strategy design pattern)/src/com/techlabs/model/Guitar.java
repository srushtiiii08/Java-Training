package com.techlabs.model;

public abstract class Guitar {

	protected IPlayBehaviour playBehaviour;
	protected ITuneBehaviour tuneBehaviour;
	protected IEffectBehaviour effectBehaviour;
	
	public Guitar() {
	}
	
	public void performPlay() {
        playBehaviour.play();
    }

    public void performTune() {
        tuneBehaviour.tune();
    }

    public void applyEffect() {
        effectBehaviour.applyEffect();
    }
    
    public void setPlayBehaviour(IPlayBehaviour p) {
        playBehaviour = p;
    }

    public void setTuneBehaviour(ITuneBehaviour t) {
        tuneBehaviour = t;
    }

    public void setEffectBehaviour(IEffectBehaviour e) {
        effectBehaviour = e;
    }

    public abstract void display();
}
