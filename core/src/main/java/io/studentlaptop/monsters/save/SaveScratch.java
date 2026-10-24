package io.studentlaptop.monsters.save;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonWriter;
import io.studentlaptop.monsters.monster.Monster;
import io.studentlaptop.monsters.monster.SpeciesInfo;
import io.studentlaptop.monsters.player.Player;

public class SaveScratch {

    public static String savePlayer(Json json, Player player){
        return json.toJson(player);
    }

    public static void main() {
        Json json = new Json();
        json.setOutputType(JsonWriter.OutputType.json);

        Player player = new Player("Noah");
        player.setPartySlot(0, new Monster(SpeciesInfo.ABRA));

        FileHandle saveFile = Gdx.files.local("save/data.json");
        saveFile.writeString(SaveScratch.savePlayer(json, player), false);
        IO.println(json.prettyPrint(player));
    }
}
