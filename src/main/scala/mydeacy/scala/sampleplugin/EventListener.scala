package mydeacy.scala.sampleplugin

import cn.nukkit.event.player.PlayerInteractEvent
import cn.nukkit.event.{EventHandler, Listener}
import cn.nukkit.Player
import cn.nukkit.item.Item

class EventListener extends Listener{

  @EventHandler def onTap(event: PlayerInteractEvent): Unit ={
    val player: Player = event.getPlayer
    val item : Item = player.getInventory.getItemInHand
    player.sendTip("Id: " + item.getId + ":" + item.getDamage)
  }
}
