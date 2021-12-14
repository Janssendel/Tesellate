package Omega;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

public class Tesellate extends Mod{

    public static String modname = "Tesellate";

    public Tesellate(){
        Log.info("everything that's here is useless");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();

                dialog.cont.image(Core.atlas.find("yourmodname-frog")).pad(20f).row();
                dialog.cont.button("i see frog", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        // new yourmodContent().load();
    }}