import React from 'react';
import Proptypes from 'prop-types';


let DeleteConfirmationComponent = (props) => {

    return(

<div class="modal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Patvirtinimas</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p>Ar tikrai norite ištrinti šitą sveikinimą?</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal" onClick={props.onDelete}>Uždaryti langą</button>
        <button type="button" class="btn btn-primary">Ištrinti</button>
      </div>
    </div>
  </div>
</div>
    )

}

DeleteConfirmationComponent.propTypes = {

  onDelete: Proptypes.func.isRequired
}

export default DeleteConfirmationComponent;