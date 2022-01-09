package com.envyful.placeholders.reforged.extension.special.impl;

import com.envyful.placeholders.reforged.extension.special.MatcherReforgedExtension;
import com.google.common.collect.Lists;
import com.pixelmonmod.pixelmon.enums.EnumSpecies;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.List;

public class SpeciesAbilityTwoExtension extends MatcherReforgedExtension {

    private static final String NAME = "ability_2";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Gets the pokemon's second ability");
    private static final List<String> EXAMPLES = Lists.newArrayList("%reforged_pokedex_bulbasaur_ability_2%");

    public SpeciesAbilityTwoExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    protected String parse(EntityPlayerMP player, String placeholder, EnumSpecies species) {
        return species.getBaseStats().getAbilitiesArray()[1];
    }
}
