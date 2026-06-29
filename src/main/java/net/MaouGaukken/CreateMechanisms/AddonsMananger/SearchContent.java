package net.MaouGaukken.CreateMechanisms.AddonsMananger;

import net.neoforged.fml.ModList;

public class SearchContent {

    public boolean HaveModId (String ModID) {
        String y = ModID;
        if (ModList.get().isLoaded(y)) {
            return true;
        } else {
            return false;
        }
    }

}
