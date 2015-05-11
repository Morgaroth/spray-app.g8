package $package$

import akka.actor.ActorSystem
import spray.routing._

trait WebApi extends Directives {
  val routes: Route = get {
    complete("Hello from $name$ application")
  }
}

trait Backend {
  val system = ActorSystem("LOCAL")
}
