package $package$

import akka.actor.ActorSystem
import spray.routing._

trait Backend {
  val system = ActorSystem("LOCAL")
}

trait WebApi extends Directives {
  this: Backend =>
  val routes: Route = get {
    complete("Hello from $name$ application")
  }
}


