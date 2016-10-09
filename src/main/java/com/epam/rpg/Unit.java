package com.epam.rpg;

public abstract class Unit {
    private Animation curAnimation = Animation.STAND;

    public Unit withAnimation(Animation animation) {
        curAnimation = animation;
        return this;
    }

    @Override
    public String toString() {
        return render() + " " + renderAnimation();
    }

    protected abstract String render();

    private String renderAnimation() {
        switch (curAnimation) {
            case STAND:
                return "передвигается";
            case WALK:
                return "стоит";
            case ATTACK:
                return "атакует";
        }
        return "теряется в догадках";
    }
}

enum Animation {
    STAND,
    WALK,
    ATTACK
}
