import React from 'react';
import {Link} from 'react-router-dom';

let NavigationComponent = (props) => {

return(

  <div>
    <div>
        <nav className="navbar navbar-inverse">
          <div className="container-fluid">   
            <ul className="nav navbar-nav">
               <li><Link to="/Elbromistafalso-spring" >Svenciu sarasas</Link></li>
               <li><Link to="/newSvente" >Nauja Svente</Link></li>
           </ul>
          </div>
        </nav>
    </div>
    {props.children}
  </div>
    )
}
export default NavigationComponent