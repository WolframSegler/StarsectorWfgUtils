package wfg.utils.ui;

import com.fs.starfarer.api.combat.BaseEveryFrameCombatPlugin;

public final class UiHierarchyTreeCombat extends BaseEveryFrameCombatPlugin {
    public UiHierarchyTreeCombat() {
        new UIHierarchyTree();
    }
}