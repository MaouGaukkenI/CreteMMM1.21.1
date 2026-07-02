package net.MaouGaukken.CreateMechanisms.Compiler;

import net.MaouGaukken.CreateMechanisms.AddonsMananger.SearchContent;
import net.neoforged.fml.ModList;

import java.util.HashMap;
import java.util.Map;

public class AddonsIds {

    /**
     * Mod List
     *
     * @return
     */
    public Map<String, Boolean> getInstalledMods() {
        Map<String, Boolean> modsStatus = new HashMap<>();
        ModList.get().getMods().forEach(modInfo -> {
            modsStatus.put(modInfo.getModId(), true);
        });
        return modsStatus;
    }

    /**
     * Search in mod list this modId
     *
     * @param modId
     * @return Instaled mod by modId.
     */
    public boolean isInstalled(String modId) {
        return ModList.get().isLoaded(modId);
    }

    /** Advanced Netherite */
    public boolean _1() {
        return isInstalled("advancednetherite");
    }

    /** Applied Energistics 2 */
    public boolean _2() {
        return isInstalled("ae2");
    }

    /** Ars Nouveau */
    public boolean _3() {
        return isInstalled("ars_nouveau");
    }

    /** Corail Tombstone */
    public boolean _4() {
        return isInstalled("tombstone");
    }

    /** Create Aeronautics */
    public boolean _5() {
        return isInstalled("aeronautics");
    }

    /** Create Diesel Generators */
    public boolean _6() {
        return isInstalled("createdieselgenerators");
    }

    /** Create Nuclear */
    public boolean _7() {
        return isInstalled("createnuclear");
    }

    /** Create Ore Excavation */
    public boolean _8() {
        return isInstalled("createoreexcavation");
    }

    /** Create: Deep Dark */
    public boolean _9() {
        return isInstalled("create_deep_dark");
    }

    /** Create: Enchantment Industry */
    public boolean _10() {
        return isInstalled("create_enchantment_industry");
    }

    /** Create: New Age */
    public boolean _11() {
        return isInstalled("create_new_age");
    }

    /** Creating Space */
    public boolean _12() {
        return isInstalled("creatingspace");
    }

    /** Deeper and Darker */
    public boolean _13() {
        return isInstalled("deeperdarker");
    }

    /** Evil Craft */
    public boolean _14() {
        return isInstalled("evilcraft");
    }

    /** Integrated Dynamics */
    public boolean _15() {
        return isInstalled("integrateddynamics");
    }

    /** Just Dire Things */
    public boolean _16() {
        return isInstalled("justdirethings");
    }

    /** Occultism */
    public boolean _17() {
        return isInstalled("occultism");
    }

    /** Powah */
    public boolean _18() {
        return isInstalled("powah");
    }

    /** Refined Storage */
    public boolean _19() {
        return isInstalled("refinedstorage");
    }

    /** Simply Light */
    public boolean _20() {
        return isInstalled("simplylight");
    }

    /** Theurgy */
    public boolean _21() {
        return isInstalled("theurgy");
    }

    /** Tom's Simple Storage */
    public boolean _22() {
        return isInstalled("toms_storage");
    }

    /** Torchmaster */
    public boolean _23() {
        return isInstalled("torchmaster");
    }

    /** Trash Cans */
    public boolean _24() {
        return isInstalled("trashcans");
    }
}
