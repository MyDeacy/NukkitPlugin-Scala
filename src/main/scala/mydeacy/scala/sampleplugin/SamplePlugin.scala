package mydeacy.scala.sampleplugin

import cn.nukkit.plugin.PluginBase

class SamplePlugin extends PluginBase {

  override def onEnable(): Unit = {
    getLogger.info("Hello Nukkit!!!")
    getServer.getPluginManager.registerEvents(new EventListener, this)
  }
}
