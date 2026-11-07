package wfg.utils.ui;

import com.fs.starfarer.api.EveryFrameScript;

public final class UiHierarchyTreeCampaign implements EveryFrameScript {

    public UiHierarchyTreeCampaign() {
        new UIHierarchyTree();
    }

    public void advance(float amount) {}
    public boolean isDone() { return false; }
    public boolean runWhilePaused() { return true; }
}