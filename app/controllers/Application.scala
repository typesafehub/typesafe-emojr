package controllers

import com.typesafe.emoji.ShortCodes.Defaults._
import com.typesafe.emoji.ShortCodes.Implicits._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val relaxed = "relaxed".emoji
    val heart = "heart".emoji
    val message = s"Welcome to Typesafe Emo${heart}r!"
    play.api.Logger.info(s"Index page rendered successfully $relaxed")
    Ok(views.html.index(message))
  }

}